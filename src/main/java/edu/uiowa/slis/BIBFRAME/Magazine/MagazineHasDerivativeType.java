package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasDerivativeIterator theMagazineHasDerivativeIterator = (MagazineHasDerivativeIterator)findAncestorWithClass(this, MagazineHasDerivativeIterator.class);
			pageContext.getOut().print(theMagazineHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

