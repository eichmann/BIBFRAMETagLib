package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasOtherEditionInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasOtherEditionInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasOtherEditionInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasOtherEditionInverseIterator theIntegratingResourceHasOtherEditionInverseIterator = (IntegratingResourceHasOtherEditionInverseIterator)findAncestorWithClass(this, IntegratingResourceHasOtherEditionInverseIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasOtherEditionInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

