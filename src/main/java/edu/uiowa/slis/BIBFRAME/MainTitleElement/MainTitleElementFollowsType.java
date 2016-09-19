package edu.uiowa.slis.BIBFRAME.MainTitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MainTitleElementFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MainTitleElementFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MainTitleElementFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MainTitleElementFollowsIterator theMainTitleElementFollowsIterator = (MainTitleElementFollowsIterator)findAncestorWithClass(this, MainTitleElementFollowsIterator.class);
			pageContext.getOut().print(theMainTitleElementFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MainTitleElement for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing MainTitleElement for follows tag ");
		}
		return SKIP_BODY;
	}
}

