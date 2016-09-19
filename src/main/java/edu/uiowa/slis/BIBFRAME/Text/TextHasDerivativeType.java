package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasDerivativeIterator theTextHasDerivativeIterator = (TextHasDerivativeIterator)findAncestorWithClass(this, TextHasDerivativeIterator.class);
			pageContext.getOut().print(theTextHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

