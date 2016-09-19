package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasOtherEditionInverseIterator theTextHasOtherEditionInverseIterator = (TextHasOtherEditionInverseIterator)findAncestorWithClass(this, TextHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theTextHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

