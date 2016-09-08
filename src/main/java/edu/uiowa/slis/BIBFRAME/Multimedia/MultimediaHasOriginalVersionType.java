package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasOriginalVersionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasOriginalVersionType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasOriginalVersionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasOriginalVersionIterator theMultimediaHasOriginalVersionIterator = (MultimediaHasOriginalVersionIterator)findAncestorWithClass(this, MultimediaHasOriginalVersionIterator.class);
			pageContext.getOut().print(theMultimediaHasOriginalVersionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasOriginalVersion tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasOriginalVersion tag ");
		}
		return SKIP_BODY;
	}
}

