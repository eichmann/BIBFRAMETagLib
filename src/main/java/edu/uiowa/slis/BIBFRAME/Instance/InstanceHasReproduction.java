package edu.uiowa.slis.BIBFRAME.Instance;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstanceHasReproduction extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static InstanceHasReproduction currentInstance = null;
	private static final Log log = LogFactory.getLog(InstanceHasReproduction.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstanceHasReproductionIterator theInstanceHasReproductionIterator = (InstanceHasReproductionIterator)findAncestorWithClass(this, InstanceHasReproductionIterator.class);
			pageContext.getOut().print(theInstanceHasReproductionIterator.getHasReproduction());
		} catch (Exception e) {
			log.error("Can't find enclosing Instance for hasReproduction tag ", e);
			throw new JspTagException("Error: Can't find enclosing Instance for hasReproduction tag ");
		}
		return SKIP_BODY;
	}
}

