package edu.uiowa.slis.BIBFRAME.IntegratingResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IntegratingResourceFollows extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IntegratingResourceFollows currentInstance = null;
	private static final Log log = LogFactory.getLog(IntegratingResourceFollows.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			IntegratingResourceFollowsIterator theIntegratingResourceFollowsIterator = (IntegratingResourceFollowsIterator)findAncestorWithClass(this, IntegratingResourceFollowsIterator.class);
			pageContext.getOut().print(theIntegratingResourceFollowsIterator.getFollows());
		} catch (Exception e) {
			log.error("Can't find enclosing IntegratingResource for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing IntegratingResource for follows tag ");
		}
		return SKIP_BODY;
	}
}

