package mod.hilal.saif.asd;

import android.view.View;
import android.widget.EditText;

import mod.SketchwareUtil;

public class AsdHandlerCancel implements View.OnClickListener {

    public final EditText editText;
    public final AsdOrigin asdOrigin;

    public AsdHandlerCancel(EditText editText, AsdOrigin asdOrigin) {
        this.editText = editText;
        this.asdOrigin = asdOrigin;
    }

    @Override
    public void onClick(View v) {
        SketchwareUtil.hideKeyboard(editText);
        asdOrigin.dismiss();
    }
}
