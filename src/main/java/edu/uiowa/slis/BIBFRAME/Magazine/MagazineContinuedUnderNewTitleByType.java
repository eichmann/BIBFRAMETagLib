package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineContinuedUnderNewTitleByIterator theMagazineContinuedUnderNewTitleByIterator = (MagazineContinuedUnderNewTitleByIterator)findAncestorWithClass(this, MagazineContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theMagazineContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

