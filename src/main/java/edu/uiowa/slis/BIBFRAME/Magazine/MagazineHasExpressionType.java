package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasExpressionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasExpressionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasExpressionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasExpressionIterator theMagazineHasExpressionIterator = (MagazineHasExpressionIterator)findAncestorWithClass(this, MagazineHasExpressionIterator.class);
			pageContext.getOut().print(theMagazineHasExpressionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasExpression tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasExpression tag ");
		}
		return SKIP_BODY;
	}
}

