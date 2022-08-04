package ${package_name}

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ${module_name}Fragment : BaseFragment<${module_name}Contract.Presenter>(), 
        ${module_name}Contract.View {

    //region Properties
    
    //endregion

    //region Lifecycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = ${module_name}Presenter(this, ${module_name}Interactor())
        presenter?.onCreate()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_${module_name}, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        presenter?.onStart()
    }

    override fun onResume() {
        super.onResume()
        presenter?.onResume()
    }

    override fun onPause() {
        super.onPause()
        presenter?.onPause()
    }

    override fun onStop() {
        super.onStop()
        presenter?.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
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