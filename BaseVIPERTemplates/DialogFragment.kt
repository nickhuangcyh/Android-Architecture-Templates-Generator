package ${package_name}

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ${module_name}DialogFragment : BaseDialogFragment<${module_name}Contract.Presenter>(), 
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
        dialog?.setCanceledOnTouchOutside(false)
        dialog?.setCancelable(false)
        return inflater.inflate(R.layout.dialog_fragment_${lowercase_module_name}, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupView(view)
    }

    //endregion

    //region Private Method
    private fun setupView(view: View) {

    }
    //endregion

    //region ${module_name}Contract.View

    //endregion

    companion object {
        private const val PARAM_1 = "param1"
        /**
         * Use this factory method to create a new instance of
         * @return A new instance of fragment ${module_name}Fragment.
         */
        @JvmStatic
        fun newInstance(param1: String) = ${module_name}DialogFragment().apply {
            arguments = Bundle().apply {
                putString(PARAM_1, param1)
            }
        }
    }
}