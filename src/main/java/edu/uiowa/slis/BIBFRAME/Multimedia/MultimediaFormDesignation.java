package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaFormDesignation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaFormDesignation currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaFormDesignation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultimediaFormDesignationIterator theMultimedia = (MultimediaFormDesignationIterator)findAncestorWithClass(this, MultimediaFormDesignationIterator.class);
			pageContext.getOut().print(theMultimedia.getFormDesignation());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for formDesignation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for formDesignation tag ");
		}
		return SKIP_BODY;
	}
}

