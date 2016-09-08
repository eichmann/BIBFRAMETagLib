package edu.uiowa.slis.BIBFRAME.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SeriesLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Series theSeries = (Series)findAncestorWithClass(this, Series.class);
			if (!theSeries.commitNeeded) {
				pageContext.getOut().print(theSeries.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Series for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Series theSeries = (Series)findAncestorWithClass(this, Series.class);
			return theSeries.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Series for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Series theSeries = (Series)findAncestorWithClass(this, Series.class);
			theSeries.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Series for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for label tag ");
		}
	}
}

