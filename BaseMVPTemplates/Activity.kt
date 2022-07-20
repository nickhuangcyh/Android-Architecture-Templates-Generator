package ${package_name}

import android.os.Bundle

class ${module_name}Activity : BaseActivity<${module_name}Contract.Presenter>(), ${module_name}Contract.View {

    //region Properties
    
    //endregion

    //region Lifecycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_${lowercase_module_name})

        presenter = ${module_name}Presenter(this, ${module_name}Interactor())
        presenter?.onCreate()
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
}