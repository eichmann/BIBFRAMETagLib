package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceHasInstanceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceHasInstanceType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceHasInstanceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceHasInstanceIterator theIntegratingResourceHasInstanceIterator = (IntegratingResourceHasInstanceIterator)findAncestorWithClass(this, IntegratingResourceHasInstanceIterator.class);
			pageContext.getOut().print(theIntegratingResourceHasInstanceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for hasInstance tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for hasInstance tag ");
		}
		return SKIP_BODY;
	}
}

