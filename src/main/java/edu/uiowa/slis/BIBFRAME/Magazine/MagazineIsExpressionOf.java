package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsExpressionOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineIsExpressionOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsExpressionOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIsExpressionOfIterator theMagazineIsExpressionOfIterator = (MagazineIsExpressionOfIterator)findAncestorWithClass(this, MagazineIsExpressionOfIterator.class);
			pageContext.getOut().print(theMagazineIsExpressionOfIterator.getIsExpressionOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isExpressionOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isExpressionOf tag ");
		}
		return SKIP_BODY;
	}
}

