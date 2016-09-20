package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasOtherEdition extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasOtherEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasOtherEdition.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasOtherEditionIterator theDissertationHasOtherEditionIterator = (DissertationHasOtherEditionIterator)findAncestorWithClass(this, DissertationHasOtherEditionIterator.class);
			pageContext.getOut().print(theDissertationHasOtherEditionIterator.getHasOtherEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

