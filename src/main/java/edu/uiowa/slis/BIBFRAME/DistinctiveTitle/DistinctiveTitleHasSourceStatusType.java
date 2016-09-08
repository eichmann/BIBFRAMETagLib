package edu.uiowa.slis.BIBFRAME.DistinctiveTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistinctiveTitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistinctiveTitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(DistinctiveTitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DistinctiveTitleHasSourceStatusIterator theDistinctiveTitleHasSourceStatusIterator = (DistinctiveTitleHasSourceStatusIterator)findAncestorWithClass(this, DistinctiveTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theDistinctiveTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DistinctiveTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

