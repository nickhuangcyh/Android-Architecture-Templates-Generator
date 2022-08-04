package ${package_name}

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ${module_name}Fragment : BaseFragment(), ${module_name}Contract.View {

    //region Properties
    override var presenter: ${module_name}Contract.Presenter? = null
    //endregion

    //region Lifecycle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_${lowercase_module_name}, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView(view)
    }
    //endregion

    //region ${module_name}Contract.View
    override fun setupView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
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