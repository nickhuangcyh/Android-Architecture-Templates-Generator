package ${package_name}

class ${module_name}Presenter(override var view: ${module_name}Contract.View?, override var interactor: ${module_name}Contract.Interactor?) : ${module_name}Contract.Presenter {

    //region Properties

    //endregion

    //region ${module_name}Contract.Presenter
    override fun onDestory() {
        view = null
        interactor = null
    }
    //endregion
}