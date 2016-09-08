package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationPerformedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationPerformedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationPerformedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationPerformedAtIterator theDissertationPerformedAtIterator = (DissertationPerformedAtIterator)findAncestorWithClass(this, DissertationPerformedAtIterator.class);
			pageContext.getOut().print(theDissertationPerformedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

