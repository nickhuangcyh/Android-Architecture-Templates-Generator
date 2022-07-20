package ${package_name}

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager

class ${module_name}DialogFragment : BaseDialogFragment<${module_name}Contract.Presenter>(), 
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
        val view = inflater.inflate(R.layout.dialog_fragment_${module_name}, container, false)
        setupView(view)

        dialog?.window?.setFlags(WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog?.setCanceledOnTouchOutside(false)

        return view
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

    //region Private Method

    private fun setupView(view: View) {

    }
    
    //endregion

    //region ${module_name}Contract.View
    
    //endregion

    companion object {
        /**
         * Use this factory method to create a new instance of
         * @return A new instance of fragment ${module_name}DialogFragment.
         */
        @JvmStatic
        fun newInstance() = ${module_name}DialogFragment()
    }
}