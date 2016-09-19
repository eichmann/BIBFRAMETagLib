package edu.uiowa.slis.BIBFRAME.ConciseTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConciseTitleHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConciseTitleHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConciseTitleHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConciseTitleHasDerivativeIterator theConciseTitleHasDerivativeIterator = (ConciseTitleHasDerivativeIterator)findAncestorWithClass(this, ConciseTitleHasDerivativeIterator.class);
			pageContext.getOut().print(theConciseTitleHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConciseTitle for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConciseTitle for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

