package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaCreatedForDegreeType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaCreatedForDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaCreatedForDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaCreatedForDegreeIterator theMultimediaCreatedForDegreeIterator = (MultimediaCreatedForDegreeIterator)findAncestorWithClass(this, MultimediaCreatedForDegreeIterator.class);
			pageContext.getOut().print(theMultimediaCreatedForDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for createdForDegree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for createdForDegree tag ");
		}
		return SKIP_BODY;
	}
}

