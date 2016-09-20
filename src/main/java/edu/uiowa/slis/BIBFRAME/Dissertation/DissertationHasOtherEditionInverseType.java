package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationHasOtherEditionInverseIterator theDissertationHasOtherEditionInverseIterator = (DissertationHasOtherEditionInverseIterator)findAncestorWithClass(this, DissertationHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theDissertationHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

