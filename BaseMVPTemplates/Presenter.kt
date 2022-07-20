package ${package_name}

class ${module_name}Presenter(override var view: ${module_name}Contract.View?,
                         override var interactor: ${module_name}Contract.Interactor?)
    : BasePresenter<${module_name}Contract.View, ${module_name}Contract.Interactor>(), 
        ${module_name}Contract.Presenter, 
        ${module_name}Contract.InteractorOutput {

    //region Properties

    //endregion

    //region ${module_name}Contract.Presenter
    
    override fun onCreate() {
        super.onCreate()
        
        interactor?.output = this
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()

        view = null
        interactor?.output = null
        interactor = null
    }

    //endregion

    //region ${module_name}Contract.InteractorOutput
    
    //endregion
}