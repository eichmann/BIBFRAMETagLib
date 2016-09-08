package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Series theSeries = (Series)findAncestorWithClass(this, Series.class);
			if (!theSeries.commitNeeded) {
				pageContext.getOut().print(theSeries.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Series for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Series theSeries = (Series)findAncestorWithClass(this, Series.class);
			return theSeries.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Series for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Series theSeries = (Series)findAncestorWithClass(this, Series.class);
			theSeries.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Series for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for subjectURI tag ");
		}
	}
}

