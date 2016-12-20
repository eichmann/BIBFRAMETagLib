package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceAccompaniedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceAccompaniedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceAccompaniedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceAccompaniedByIterator theIntegratingResourceAccompaniedByIterator = (IntegratingResourceAccompaniedByIterator)findAncestorWithClass(this, IntegratingResourceAccompaniedByIterator.class);
			pageContext.getOut().print(theIntegratingResourceAccompaniedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

