package ExcelRead;

import org.scilab.forge.jlatexmath.DefaultTeXFont;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXEnvironment;

public static String sym(String symCommand) throws Exception {
        StringBufferWriter buf = new StringBufferWriter();
        IExpr result = GlobalValues.symUtil.evaluate(symCommand);
        OutputFormFactory.get().convert(buf, result);
        String output = buf.toString();

        output = symCommand + " = " + output;

        int FONT_SIZE_TEX = GlobalValues.FONT_SIZE_TEX;

        if (GlobalValues.displayLatexOnEval) {
// display the LaTex formula graphically
            final StringBufferWriter bufTex = new StringBufferWriter();
            GlobalValues.texUtil.toTeX(symCommand + "=" + result, bufTex);
            String forLatexPrettyOut = bufTex.toString();

            org.scilab.forge.jlatexmath.TeXFormula formula = new org.scilab.forge.jlatexmath.TeXFormula(forLatexPrettyOut);
            org.scilab.forge.jlatexmath.TeXIcon ticon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, FONT_SIZE_TEX, TeXConstants.UNIT_PIXEL, 80, TeXConstants.ALIGN_LEFT);

            GlobalValues.uiTabbedPane.setIconAt(0, ticon);

        }
        return output;
    }
}