package ${package_name}

class ${module_name}Presenter(override var view: ${module_name}Contract.View?, 
                        override var interactor: ${module_name}Contract.Interactor?, 
                        override var router: ${module_name}Contract.Router?) 
    : BasePresenter<${module_name}Contract.View, ${module_name}Contract.Interactor, ${module_name}Contract.Router>(), 
    ${module_name}Contract.Presenter, ${module_name}Contract.InteractorOutput {

    //region Properties

    //endregion

    //region ${module_name}Contract.Presenter
    override fun onCreate() {
        interactor?.output = this
    }
    //endregion
}