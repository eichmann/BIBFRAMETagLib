package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasOtherEditionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasOtherEditionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasOtherEditionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasOtherEditionInverseIterator theDissertationHasOtherEditionInverseIterator = (DissertationHasOtherEditionInverseIterator)findAncestorWithClass(this, DissertationHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theDissertationHasOtherEditionInverseIterator.getHasOtherEditionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

