package edu.uiowa.slis.BIBFRAME.ConciseTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConciseTitleHasSourceStatusType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConciseTitleHasSourceStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConciseTitleHasSourceStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConciseTitleHasSourceStatusIterator theConciseTitleHasSourceStatusIterator = (ConciseTitleHasSourceStatusIterator)findAncestorWithClass(this, ConciseTitleHasSourceStatusIterator.class);
			pageContext.getOut().print(theConciseTitleHasSourceStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConciseTitle for hasSourceStatus tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for hasSourceStatus tag ");
		}
		return SKIP_BODY;
	}
}

