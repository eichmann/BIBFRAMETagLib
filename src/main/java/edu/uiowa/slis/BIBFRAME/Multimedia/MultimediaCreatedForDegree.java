package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaCreatedForDegree extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaCreatedForDegree currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaCreatedForDegree.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaCreatedForDegreeIterator theMultimediaCreatedForDegreeIterator = (MultimediaCreatedForDegreeIterator)findAncestorWithClass(this, MultimediaCreatedForDegreeIterator.class);
			pageContext.getOut().print(theMultimediaCreatedForDegreeIterator.getCreatedForDegree());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

