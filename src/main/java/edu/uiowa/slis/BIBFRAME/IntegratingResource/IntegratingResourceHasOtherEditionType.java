package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasOtherEditionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasOtherEditionType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasOtherEditionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasOtherEditionIterator theIntegratingResourceHasOtherEditionIterator = (IntegratingResourceHasOtherEditionIterator)findAncestorWithClass(this, IntegratingResourceHasOtherEditionIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasOtherEditionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasOtherEdition tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasOtherEdition tag ");
		}
		return SKIP_BODY;
	}
}

