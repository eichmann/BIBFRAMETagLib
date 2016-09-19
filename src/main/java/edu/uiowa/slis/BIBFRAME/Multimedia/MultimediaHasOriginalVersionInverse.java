package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasOriginalVersionInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasOriginalVersionInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasOriginalVersionInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasOriginalVersionInverseIterator theMultimediaHasOriginalVersionInverseIterator = (MultimediaHasOriginalVersionInverseIterator)findAncestorWithClass(this, MultimediaHasOriginalVersionInverseIterator.class);
			pageContext.getOut().print(theMultimediaHasOriginalVersionInverseIterator.getHasOriginalVersionInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

