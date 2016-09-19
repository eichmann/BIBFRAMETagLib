package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasDerivative extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasDerivative currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasDerivative.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasDerivativeIterator theMultimediaHasDerivativeIterator = (MultimediaHasDerivativeIterator)findAncestorWithClass(this, MultimediaHasDerivativeIterator.class);
			pageContext.getOut().print(theMultimediaHasDerivativeIterator.getHasDerivative());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

