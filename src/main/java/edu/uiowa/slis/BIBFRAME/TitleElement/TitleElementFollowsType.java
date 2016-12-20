package edu.uiowa.slis.BIBFRAME.TitleElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleElementFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TitleElementFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleElementFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TitleElementFollowsIterator theTitleElementFollowsIterator = (TitleElementFollowsIterator)findAncestorWithClass(this, TitleElementFollowsIterator.class);
			pageContext.getOut().print(theTitleElementFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing TitleElement for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing TitleElement for follows tag ");
		}
		return SKIP_BODY;
	}
}

