package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasPartType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasPartType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasPartType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasPartIterator theMultimediaHasPartIterator = (MultimediaHasPartIterator)findAncestorWithClass(this, MultimediaHasPartIterator.class);
			pageContext.getOut().print(theMultimediaHasPartIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

