package edu.uiowa.slis.BIBFRAME.AbbreviatedTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbbreviatedTitleHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static AbbreviatedTitleHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbbreviatedTitleHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbbreviatedTitleHasDerivativeIterator theAbbreviatedTitleHasDerivativeIterator = (AbbreviatedTitleHasDerivativeIterator)findAncestorWithClass(this, AbbreviatedTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theAbbreviatedTitleHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AbbreviatedTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing AbbreviatedTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

