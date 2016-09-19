package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasDataSourceInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasDataSourceInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasDataSourceInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasDataSourceInverseIterator theMultimediaHasDataSourceInverseIterator = (MultimediaHasDataSourceInverseIterator)findAncestorWithClass(this, MultimediaHasDataSourceInverseIterator.class);
			pageContext.getOut().print(theMultimediaHasDataSourceInverseIterator.getHasDataSourceInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

