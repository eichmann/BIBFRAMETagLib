package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasDerivativeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasDerivativeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasDerivativeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasDerivativeIterator theMultimediaHasDerivativeIterator = (MultimediaHasDerivativeIterator)findAncestorWithClass(this, MultimediaHasDerivativeIterator.class);
			pageContext.getOut().print(theMultimediaHasDerivativeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasDerivative tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasDerivative tag ");
		}
		return SKIP_BODY;
	}
}

