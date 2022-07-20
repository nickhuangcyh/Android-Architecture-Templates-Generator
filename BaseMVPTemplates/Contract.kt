package ${package_name}

interface ${module_name}Contract {

    interface View : BaseContract.View<Presenter> {

    }

    interface Presenter : BaseContract.Presenter<View, Interactor> {

    }
    
    interface InteractorOutput : BaseContract.InteractorOutput {

    }

    interface Interactor : BaseContract.Interactor<InteractorOutput> {

    }
}