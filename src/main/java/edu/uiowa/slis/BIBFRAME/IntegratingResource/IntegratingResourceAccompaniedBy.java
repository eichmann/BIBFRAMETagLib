package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceAccompaniedByIterator theIntegratingResourceAccompaniedByIterator = (IntegratingResourceAccompaniedByIterator)findAncestorWithClass(this, IntegratingResourceAccompaniedByIterator.class);
			pageContext.getOut().print(theIntegratingResourceAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

