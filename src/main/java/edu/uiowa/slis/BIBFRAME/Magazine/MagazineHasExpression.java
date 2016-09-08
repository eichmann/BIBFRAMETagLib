package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasExpression extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasExpression currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasExpression.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasExpressionIterator theMagazineHasExpressionIterator = (MagazineHasExpressionIterator)findAncestorWithClass(this, MagazineHasExpressionIterator.class);
			pageContext.getOut().print(theMagazineHasExpressionIterator.getHasExpression());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

