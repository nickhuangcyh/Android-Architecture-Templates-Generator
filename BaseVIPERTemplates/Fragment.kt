package ${package_name}

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ${module_name}Fragment : BaseFragment<${module_name}Contract.Presenter>(), 
    ${module_name}Contract.View {

    //region Properties
    override var presenter: ${module_name}Contract.Presenter? = null
    //endregion

    //region Lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        presenter = ${module_name}Presenter(
            this, 
            ${module_name}Interactor(), 
            ${module_name}Router(this)
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_${lowercase_module_name}, container, false)
        setupView(view)

        presenter?.onCreateView()

        return view
    }
    //endregion

    //region Private Method
    private fun setupView(view: View) {

    }
    //endregion

    //region ${module_name}Contract.View

    //endregion

    companion object {
        /**
         * Use this factory method to create a new instance of
         * @return A new instance of fragment ${module_name}Fragment.
         */
        @JvmStatic
        fun newInstance() = ${module_name}Fragment()
    }
}