package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourcePerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourcePerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourcePerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourcePerformedAtIterator theIntegratingResourcePerformedAtIterator = (IntegratingResourcePerformedAtIterator)findAncestorWithClass(this, IntegratingResourcePerformedAtIterator.class);
			pageContext.getOut().print(theIntegratingResourcePerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

