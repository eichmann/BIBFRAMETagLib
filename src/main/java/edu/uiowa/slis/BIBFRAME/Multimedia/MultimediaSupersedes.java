package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaSupersedesIterator theMultimediaSupersedesIterator = (MultimediaSupersedesIterator)findAncestorWithClass(this, MultimediaSupersedesIterator.class);
			pageContext.getOut().print(theMultimediaSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

