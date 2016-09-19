package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RWOFollowsIterator theRWOFollowsIterator = (RWOFollowsIterator)findAncestorWithClass(this, RWOFollowsIterator.class);
			pageContext.getOut().print(theRWOFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for follows tag ");
		}
		return SKIP_BODY;
	}
}

