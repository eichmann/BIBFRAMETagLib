package edu.uiowa.slis.BIBFRAME.DistinctiveTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistinctiveTitleHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistinctiveTitleHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(DistinctiveTitleHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DistinctiveTitleHasPartIterator theDistinctiveTitleHasPartIterator = (DistinctiveTitleHasPartIterator)findAncestorWithClass(this, DistinctiveTitleHasPartIterator.class);
			pageContext.getOut().print(theDistinctiveTitleHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DistinctiveTitle for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

