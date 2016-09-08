package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaHasDataSource extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaHasDataSource currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaHasDataSource.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaHasDataSourceIterator theMultimediaHasDataSourceIterator = (MultimediaHasDataSourceIterator)findAncestorWithClass(this, MultimediaHasDataSourceIterator.class);
			pageContext.getOut().print(theMultimediaHasDataSourceIterator.getHasDataSource());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for hasDataSource tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for hasDataSource tag ");
		}
		return SKIP_BODY;
	}
}

