package edu.uiowa.slis.BIBFRAME.Monograph;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MonographFollowsType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MonographFollowsType currentInstance = null;
	private static final Log log = LogFactory.getLog(MonographFollowsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MonographFollowsIterator theMonographFollowsIterator = (MonographFollowsIterator)findAncestorWithClass(this, MonographFollowsIterator.class);
			pageContext.getOut().print(theMonographFollowsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Monograph for follows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Monograph for follows tag ");
		}
		return SKIP_BODY;
	}
}

