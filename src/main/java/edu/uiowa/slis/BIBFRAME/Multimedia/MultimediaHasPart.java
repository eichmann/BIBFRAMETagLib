package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasPartIterator theMultimediaHasPartIterator = (MultimediaHasPartIterator)findAncestorWithClass(this, MultimediaHasPartIterator.class);
			pageContext.getOut().print(theMultimediaHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

