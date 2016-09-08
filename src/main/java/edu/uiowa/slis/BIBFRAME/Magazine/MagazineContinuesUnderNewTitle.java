package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineContinuesUnderNewTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineContinuesUnderNewTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineContinuesUnderNewTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineContinuesUnderNewTitleIterator theMagazineContinuesUnderNewTitleIterator = (MagazineContinuesUnderNewTitleIterator)findAncestorWithClass(this, MagazineContinuesUnderNewTitleIterator.class);
			pageContext.getOut().print(theMagazineContinuesUnderNewTitleIterator.getContinuesUnderNewTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for continuesUnderNewTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for continuesUnderNewTitle tag ");
		}
		return SKIP_BODY;
	}
}

