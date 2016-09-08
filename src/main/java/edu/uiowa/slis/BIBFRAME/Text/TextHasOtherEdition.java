package edu.uiowa.slis.BIBFRAME.Text;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TextHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TextHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(TextHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TextHasOtherEditionIterator theTextHasOtherEditionIterator = (TextHasOtherEditionIterator)findAncestorWithClass(this, TextHasOtherEditionIterator.class);
			pageContext.getOut().print(theTextHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Text for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Text for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

